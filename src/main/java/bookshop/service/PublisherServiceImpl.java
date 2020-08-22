package bookshop.service;

import bookshop.entities.Publisher;
import bookshop.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    PublisherRepository repository;

    @Override
    public void addPublisher(Publisher publisher) {
        repository.save(publisher);
    }

    @Override
    public void deletePublisher(Publisher publisher) {
        repository.delete(publisher);
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        repository.save(publisher);
    }

    @Override
    public Publisher findById(String id) {
        return repository.findByid(id);
    }

    @Override
    public List<Publisher> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Publisher> findAll() {
        return repository.findAll();
    }
}
