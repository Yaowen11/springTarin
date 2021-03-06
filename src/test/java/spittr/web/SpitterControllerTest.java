package spittr.web;

import org.junit.Test;
import spittr.data.Spitter;
import spittr.data.SpitterRepository;

import org.springframework.web.servlet.view.InternalResourceView;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author z
 */
public class SpitterControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterController controller = new SpitterController(mock(SpitterRepository.class));
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer", "email@qq.com");
        Spitter saved = new Spitter("jbauer", "24hours", "Jack", "Bauer", "email@qq.com");
        when(mockRepository.save(unsaved)).thenReturn(saved);
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "jbauer")
                .param("password", "24hours")
        ).andExpect(redirectedUrl("/spitter/jbauer"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}
