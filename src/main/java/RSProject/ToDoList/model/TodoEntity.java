package RSProject.ToDoList.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // 오브젝트 생성을 위한 디자인 패턴
@NoArgsConstructor // 매개변수가 없는 생성자를 구현
@AllArgsConstructor // 클래스의 모든 멤버 변수를 매개변수로 받는 생성자를 구현
@Data
public class TodoEntity {
    private String id;      // 이 오브젝트의 아이디
    private String userId;  // 이 오브젝트를 생성한 사용자의 아이디
    private String title;   // Todo 타이틀(ex. 운동하기)
    private boolean done;   // true - todo를 완료한 경우(checked)
}
