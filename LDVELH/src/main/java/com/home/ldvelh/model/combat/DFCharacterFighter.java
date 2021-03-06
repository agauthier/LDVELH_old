package com.home.ldvelh.model.combat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.home.ldvelh.R;
import com.home.ldvelh.commons.Utils;
import com.home.ldvelh.model.Property;
import com.home.ldvelh.model.value.IntValueHolder;
import com.home.ldvelh.model.value.IntValueHolder.WatchType;
import com.home.ldvelh.ui.widget.CustomNumberPicker;

public class DFCharacterFighter extends DFFighter {
    private static final long serialVersionUID = -1550777227820137355L;

    public DFCharacterFighter() {
        super();
    }

    @Override
    public String getName() {
        return Utils.getString(R.string.you);
    }

    @Override
    public View createView(LayoutInflater inflater, ViewGroup root) {
        View newView = inflater.inflate(R.layout.list_item_combat_character, root, false);
        initView(newView, true);
        CustomNumberPicker bonusPicker = newView.findViewById(R.id.numberPickerBonus);
        bonusPicker.init(Property.ATTACK_BONUS.get(), WatchType.VALUE);
        return newView;
    }

    @Override
    public IntValueHolder getSkill() {
        return Property.SKILL.get();
    }

    @Override
    public IntValueHolder getStamina() {
        return Property.STAMINA.get();
    }

    @Override
    public IntValueHolder getBonus() {
        return Property.ATTACK_BONUS.get();
    }
}
