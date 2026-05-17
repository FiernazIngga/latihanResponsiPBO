package pengelolaanmovie.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pengelolaanmovie.DAO.DataMovieDao;
import pengelolaanmovie.Model.ModelMovie;
import pengelolaanmovie.View.ViewKelola;

public class MovieController {
    ViewKelola view;
    DataMovieDao dao;
    
    public MovieController(ViewKelola view, DataMovieDao dao) {
        this.dao = dao;
        this.view = view;
    }
    
    public void clearForm() {
        view.getjfJudul().setText("");
        view.getjfAlur().setText("");
        view.getjfPenokohan().setText("");
        view.getjfAkting().setText("");
    }
    
    public void loadTable() {
        List<ModelMovie> list = dao.getAll();
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("id");
        model.addColumn("Judul");
        model.addColumn("Alur");
        model.addColumn("Penokohan");
        model.addColumn("Akting");
        model.addColumn("Nilai");
        for (ModelMovie m : list) {
            model.addRow(new Object[] {
                m.getId(), m.getJudul(), m.getAlur(), m.getPenokohan(), m.getAkting(), m.getNilai()
            });
        }
        
        view.getTable().setModel(model);
        
        view.getTable().removeColumn(view.getTable().getColumnModel().getColumn(0));
    }
    
    public void tambahData() {
        String judul = view.getjfJudul().getText();
        double alur = Double.parseDouble(view.getjfAlur().getText());
        double penokohan = Double.parseDouble(view.getjfPenokohan().getText());
        double akting = Double.parseDouble(view.getjfAkting().getText());        
        
        if (alur < 0 || alur > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Alur harus antara 0 sampai 5");
            return;
        }
        if (penokohan < 0 || penokohan > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Penokohan harus antara 0 sampai 5");
            return;
        }
        if (akting < 0 || akting > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Akting harus antara 0 sampai 5");
            return;
        }
        
        double nilai = (alur + penokohan + akting) / 3;
        
        ModelMovie m = new ModelMovie();
        
        m.setJudul(judul); m.setAlur(alur); m.setPenokohan(penokohan); m.setAkting(akting); m.setNilai(nilai);
        
        dao.insert(m);
        
        JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
        clearForm();
        loadTable();
    }
    
    public void mouseClick() {
        int baris = view.getTable().getSelectedRow();
        
        view.setId(Integer.parseInt(view.getTable().getModel().getValueAt(baris,0).toString()));
        String judul = view.getTable().getValueAt(baris, 0).toString();
        String alur = view.getTable().getValueAt(baris, 1).toString();
        String penokohan = view.getTable().getValueAt(baris, 2).toString();
        String akting = view.getTable().getValueAt(baris, 3).toString();
        
        view.getjfJudul().setText(judul);
        view.getjfAlur().setText(alur);
        view.getjfPenokohan().setText(penokohan);
        view.getjfAkting().setText(akting);
    }
    
    public void edit() {
        String judul = view.getjfJudul().getText();
        double alur = Double.parseDouble(view.getjfAlur().getText());
        double penokohan = Double.parseDouble(view.getjfPenokohan().getText());
        double akting = Double.parseDouble(view.getjfAkting().getText());
        
        if (alur < 0 || alur > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Alur harus antara 0 sampai 5");
            return;
        }
        if (penokohan < 0 || penokohan > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Penokohan harus antara 0 sampai 5");
            return;
        }
        if (akting < 0 || akting > 5) {
            JOptionPane.showMessageDialog(null, "Inputan Akting harus antara 0 sampai 5");
            return;
        }
        
        ModelMovie m = new ModelMovie();
        
        m.setJudul(judul); m.setAlur(alur); m.setPenokohan(penokohan); m.setAkting(akting); m.setId(view.getId()); m.setNilai((alur+penokohan+akting)/3);
        
        dao.update(m);
        
        JOptionPane.showMessageDialog(null, "Data berhasil di update");
        clearForm();
        loadTable();
    }
    
    public void hapus() {
        dao.delete(view.getId());
        JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        loadTable();
    }
    
    public void clear() {
        String[] pilihan = {
            "Clear Textfield", "Hapus Semua Data di Database", "Cancel"
        };
        
        int pilih = JOptionPane.showOptionDialog(null, "Pilih aksi", "Konfirmasi", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pilihan, pilihan[0]);
        
        if(pilih == 0) {
            clearForm();
        } else if (pilih == 1) {
            dao.deleteAll();
            loadTable();
        } else {
            JOptionPane.showMessageDialog(null, "Dibatalkan");
        }
    }
}
