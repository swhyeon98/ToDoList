package RSProject.ToDoList.service;

import RSProject.ToDoList.model.TodoEntity;
import RSProject.ToDoList.persistence.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j  // lombok의 log 라이브러리
@Service // 비즈니스 로직을 수행하는 서비스 레이어임을 알려줌
public class TodoService {

    @Autowired
    private TodoRepository repository;
    public String testService() {
        //Todo Entity 작성
        TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
        //Todo Entity 저장
        repository.save(entity);
        //Todo Entity 검색
        TodoEntity saveEntity = repository.findById(entity.getId()).get();
        return  saveEntity.getTitle();
    }
}
