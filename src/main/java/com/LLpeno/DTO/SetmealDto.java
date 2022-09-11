package com.LLpeno.DTO;

import com.LLpeno.entity.Setmeal;
import com.LLpeno.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
