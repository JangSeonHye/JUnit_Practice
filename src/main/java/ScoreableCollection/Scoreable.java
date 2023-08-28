package JUnit_;

@FunctionalInterface
/*
해당 인터페이스가 함수형 인터페이스 조건에 맞는지 검사.
어노테이션이 없어도 함수형 인터페이스로 동작하고 사용하는 데 문제는 없으나,
    인터페이스 검증과 유지보수를 위해 붙이는 것을 권장.
*/
public interface Scoreable {
    int getScore();
}
