package org.example.SpringBootExample.dao;

//
//@Component
//public class PersonDAO {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public PersonDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    // получаем всех
//    public List<Person> index() {
//        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<Person>(Person.class));
//    }
//
//    // получаем одного
//    public Person show(int id) {
//        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
//                .stream().findAny().orElse(null);
//    }
//
//    // сохраняем
//    public void save(Person person) {
//        jdbcTemplate.update("INSERT INTO person (firstname, lastname, patronymic, \"dayOfBirth\") VALUES (?, ?, ?, ?)",
//                person.getFirstName(), person.getLastName(), person.getPatronymic(), person.getYearOfBirth());
//    }
//
//    // обновляем
//    public void update(int id, Person updatedPerson) {
//        jdbcTemplate.update("UPDATE Person SET firstname=?, lastname=?, patronymic=?,\"dayOfBirth\"=? WHERE id=?",
//                updatedPerson.getFirstName(), updatedPerson.getLastName(),
//                updatedPerson.getPatronymic(), updatedPerson.getYearOfBirth(), id);
//    }
//
//    // удаляем
//    public void delete(int id) {
//        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
//    }
//
//}
