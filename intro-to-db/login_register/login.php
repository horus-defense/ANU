
<?php
require 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $email = trim($_POST['logEmail']);
    $password = $_POST['password'];

    $sql = "SELECT name, email, password
            FROM students
            WHERE email = ?";

    $stmt = $connection->prepare($sql);
    $stmt->bind_param("s", $email);
    $stmt->execute();

    $result = $stmt->get_result();

    if ($result->num_rows == 1) {

        $user = $result->fetch_assoc();

        if (password_verify($password, $user['password'])) {

            echo "Welcome " . htmlspecialchars($user['name']) . "!";

        } else {
            echo "Wrong password!";
        }

    } else {
        echo "Wrong email!";
    }

    $stmt->close();
    $connection->close();
}
?>
