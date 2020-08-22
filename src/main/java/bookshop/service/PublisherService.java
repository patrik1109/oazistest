package bookshop.service;

import bookshop.entities.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublisherService {
    void addPublisher(Publisher publisher);
    void deletePublisher(Publisher publisher);
    void updatePublisher(Publisher publisher);
    Publisher findById(String id);
    List<Publisher> findByName(String name);
    List<Publisher> findAll();
}
