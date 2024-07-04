package google;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PageUrls {
    GOOGLE("https://www.google.com/");

    private final String url;
}
