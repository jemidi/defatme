package de.dittje.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import de.dittje.web.rest.TestUtil;

public class RecipeDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(RecipeDTO.class);
        RecipeDTO recipeDTO1 = new RecipeDTO();
        recipeDTO1.setId(1L);
        RecipeDTO recipeDTO2 = new RecipeDTO();
        assertThat(recipeDTO1).isNotEqualTo(recipeDTO2);
        recipeDTO2.setId(recipeDTO1.getId());
        assertThat(recipeDTO1).isEqualTo(recipeDTO2);
        recipeDTO2.setId(2L);
        assertThat(recipeDTO1).isNotEqualTo(recipeDTO2);
        recipeDTO1.setId(null);
        assertThat(recipeDTO1).isNotEqualTo(recipeDTO2);
    }
}
