import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    Gigasecond(LocalDate birthDate) {
        private LocalDateTime newDate;

        Gigasecond(LocalDate birthDate) {
            this.newDate = birthDate.atStartOfDay();
        }

        Gigasecond(LocalDateTime birthDateTime) {
            this.newDate = birthDateTime;
        }

        LocalDateTime getDate() {
            return newDate.plusSeconds(1_000_000_000);
        }

    }
