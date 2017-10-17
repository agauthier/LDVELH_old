package com.home.ldvelh.ui.dialog;

import com.home.ldvelh.R;
import com.home.ldvelh.model.Property;
import com.home.ldvelh.model.item.ItemAndQuantity;
import com.home.ldvelh.model.item.SimpleItem;
import com.home.ldvelh.model.value.ListValueHolder;

import android.content.Context;

public class DF03MagicItemPicker extends Store<SimpleItem> {

	public DF03MagicItemPicker(Context context) {
		super(context, null, R.layout.dialog_df03_magic_item_picker, Property.GOLD.get(), Property.MAGIC_ITEM_LIST.get());
	}

	@Override public void onBackPressed() { /* Do nothing */ }

	@Override protected void addToList(ShopPickerItem shopItem, ListValueHolder<SimpleItem> list) {
		if (shopItem.getQuantity() > 0) {
			list.add(new ItemAndQuantity(shopItem.getName(), shopItem.getQuantity()));
		}
	}
}