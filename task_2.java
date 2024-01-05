@RunWith (Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age=age;
    this.result = result;  // Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] { 
		{21, true},
        {20, false},
        {22, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	boolean isAdult = program.checkIsAdult (age, result); // Передай сюда возраст пользователя
    
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Несовершеннолетний", age, result);
	}
}
