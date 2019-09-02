module books {
    requires jackson.databind;
    opens books.demo to jackson.databind;
}