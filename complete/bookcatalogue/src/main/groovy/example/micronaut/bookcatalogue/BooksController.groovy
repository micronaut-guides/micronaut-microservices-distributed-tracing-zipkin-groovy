package example.micronaut.bookcatalogue

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller("/books")
class BooksController {

    @Get("/")
    List<Book> index() {
        [
                new Book("1491950358", "Building Microservices"),
                new Book("1680502395", "Release It!"),
                new Book("0321601912", "Continuous Delivery:"),
        ]
    }
}
