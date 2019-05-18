package ru.home.darkroom.form;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class GuestForm {
    @NotNull
    @Min(1)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Min(15)
    private Long age;

    @NotNull
    private String gender;

    @NotNull
    private Long number;

    @NotNull
    private String dateSeance;
}
