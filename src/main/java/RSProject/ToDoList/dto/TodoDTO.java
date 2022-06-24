package RSProject.ToDoList.dto;

import RSProject.ToDoList.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
    private String id;
    private String title;
    private boolean done;

    public TodoDTO(final TodoEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.done = entity.isDone();
        // userId가 없는 이유 : 스프링 시큐리티를 이용해 인증을 구현하기 때문.
        // 사용자가 자기 아이디를 넘겨주지 않아도 인증이 가능해짐. p.96 참고
    }
}
