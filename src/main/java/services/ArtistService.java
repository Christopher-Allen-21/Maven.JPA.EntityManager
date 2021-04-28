package services;

import entities.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ArtistRepository;

@Service
public class ArtistService {

    private final ArtistRepository repository;

    @Autowired
    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public Artist add(Artist artist){
        return repository.save(artist);
    }

    public Artist findOne(Long id){
        return repository.findOne(id);
    }

    public Iterable<Artist> findAll(){
        return repository.findAll();
    }

    public Artist update(Long id,Artist artist){
        Artist temp = new Artist();
        temp.setFirstName(artist.getFirstName());
        temp.setLastName(artist.getLastName());
        temp.setGenre(artist.getGenre());
        return repository.save(temp);
    }

    public boolean delete(Long id){
        repository.delete(id);
        return true;
    }



}
