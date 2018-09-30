#![feature(plugin)]
#![plugin(rocket_codegen)]

extern crate rocket;
extern crate uuid;

use uuid::Uuid;


#[get("/api/pi")]
fn api_pi() -> String {
    let pi = calc_pi(10000000);
    let uuid = Uuid::new_v4();

    // Return a string with UUID and PI
    format!("{} {}",uuid.to_hyphenated(), pi)
}

fn calc_pi(iterations:i64) -> f64 {
    let mut pi:f64 = 0.0;
    let mut counter = 1;
    while counter < iterations {
        pi = pi + (( 1.0 / (2.0 * counter as f64 - 1.0))) - (1.0 / (2.0 * counter as f64 + 1.0));
        counter += 2;
    }
    4.0 * pi
}

fn main() {
    rocket::ignite().mount("/", routes![api_pi]).launch();
}
