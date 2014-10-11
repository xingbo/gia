package qotd

class QuoteController {

    def index() { }

    def home =  {
        render "Real programmers do not eat Quiche."
    }

    def random = {
        def allQuotes = Quote.list()
        def randomQuote
        if (allQuotes.size() > 0) {
            def randomIndex = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIndex]
        } else {
            randomQuote = new Quote(author: "Anonymous",
                                    content: "Real Programmers Don't eat Quiche")
        }

        [quote: staticQuote]
    }
}
