/**
 * 
 */
package ai.pairprogram.plugin.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GPTResponse {
	private List<Choice> choices;
}
