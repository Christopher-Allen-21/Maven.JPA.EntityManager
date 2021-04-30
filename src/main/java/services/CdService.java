package services;

import entities.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CdRepository;

@Service
public class CdService {

    private final CdRepository repository;

    @Autowired
    public CdService(CdRepository repository) {
        this.repository = repository;
    }

    public Cd add(Cd cd){
        return repository.save(cd);
    }

    public Cd findOne(Long id){
        return repository.findOne(id);
    }

    public Iterable<Cd> findAll(){
        return repository.findAll();
    }

    public Cd update(Long id,Cd cd){
        Cd temp = new Cd();
        temp.setTitle(cd.getTitle());
        temp.setDescription(cd.getDescription());
        temp.setYear(cd.getYear());
        temp.setArtists(cd.getArtists());
        temp.setPrice(cd.getPrice());
        return repository.save(temp);
    }

    public boolean delete(Long id){
        repository.delete(id);
        return true;
    }
}
