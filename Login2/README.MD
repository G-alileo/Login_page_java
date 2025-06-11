# Java Swing Login UI Example

This project demonstrates how to create a modern login form using Java Swing, styled to resemble the Mailchimp login page.

## Features

- **Modern Card Layout:** The login form is centered on a white panel with a light background.
- **Styled Components:** Custom fonts, colors, and spacing for a clean, professional look.
- **Password Field:** Includes a "Show" checkbox (visual only, no functionality yet).
- **"Keep me logged in" Checkbox:** Styled and positioned as in modern login forms.
- **Rounded Login Button:** Styled with a custom color and bold font.
- **Clickable Links:** "Forgot username?", "Forgot password?", and "Can't log in?" links styled with Mailchimp's teal color.

## Screenshot

![Sample Screenshot](https://raw.githubusercontent.com/G-alileo/Login_page_java/main/Assets/Login2.png)  




## How to Run

1. **Requirements:**  
   - Java JDK 8 or higher

2. **Compile:**  
   Open a terminal in the project directory and run:
   ```
   javac Login2.java
   ```

3. **Run:**  
   ```
   java Login2
   ```

## Code Structure

- **Login2.java:**  
  Contains all the UI code. Uses a `JPanel` for the card look and absolute positioning for precise layout.

## Customization

- **Colors:**  
  The teal color used is `rgb(0,123,128)` to match Mailchimp's branding.
- **Fonts:**  
  Uses Arial in various weights and sizes for a modern appearance.
- **Button:**  
  The login button is styled with a bold font and teal background.

## Notes

- This is a UI mockup only. No actual login logic or event handling is implemented.
- The "Show" checkbox does not toggle password visibility yet.
- All links are non-functional and for display only.

## License

This project is for educational purposes.