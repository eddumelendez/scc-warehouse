import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/products'
        headers {
            contentType applicationJsonUtf8()
        }
    }
    response {
        status 200
        headers {
            contentType applicationJsonUtf8()
        }
        body(products: [
                [
                        id    : 1,
                        name  : "Hulk Pop",
                        sku   : "FU32690",
                        status: "Coming in September 2018",
                        price : "\$ 10.99"
                ],
                [
                        id    : 2,
                        name  : "Groot with Stormbreaker Pop",
                        sku   : "FU35773",
                        status: "Coming in December 2018",
                        price : "\$ 10.99"
                ],
                [
                        id    : 3,
                        name  : "Bucky with weapon",
                        sku   : "FU35775",
                        status: "Coming in December 2018",
                        price : "\$ 10.99"]
        ])
    }
}
