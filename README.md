### haproxy sandbox

- start services `./setup.sh`
- start haproxy `haproxy/setup.sh`
- import postman collection

use the `setLoad` endpoints to set the load score, if it is over 100 the server is considered overloaded

use `setState` endpoint with `admin_state = ready | drain | maint`
