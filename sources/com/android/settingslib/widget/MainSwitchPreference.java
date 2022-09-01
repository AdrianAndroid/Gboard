package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainSwitchPreference extends TwoStatePreference implements ata {
    private final List c = new ArrayList();
    private MainSwitchBar d;

    public MainSwitchPreference(Context context) {
        super(context);
        ag(context, null);
    }

    private final void ag(Context context, AttributeSet attributeSet) {
        this.F = R.layout.f145070_resource_name_obfuscated_res_0x7f0e0525;
        this.c.add(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.g, 0, 0);
            Q(obtainStyledAttributes.getText(4));
            K(obtainStyledAttributes.getBoolean(15, true));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.preference.Preference
    public final void K(boolean z) {
        super.K(z);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar == null || mainSwitchBar.a == null || yc.c()) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mainSwitchBar.a.getLayoutParams();
        int dimensionPixelSize = mainSwitchBar.getContext().getResources().getDimensionPixelSize(R.dimen.f41820_resource_name_obfuscated_res_0x7f070650);
        if (true != z) {
            dimensionPixelSize = 0;
        }
        layoutParams.setMarginStart(dimensionPixelSize);
        mainSwitchBar.a.setLayoutParams(layoutParams);
    }

    @Override // androidx.preference.Preference
    public final void Q(CharSequence charSequence) {
        super.Q(charSequence);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar != null) {
            mainSwitchBar.c(charSequence);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        aisVar.u = false;
        aisVar.v = false;
        MainSwitchBar mainSwitchBar = (MainSwitchBar) aisVar.F(R.id.f68450_resource_name_obfuscated_res_0x7f0b08e9);
        this.d = mainSwitchBar;
        mainSwitchBar.setOnClickListener(new hk(this, 5));
        K(this.D);
        k(((TwoStatePreference) this).a);
        MainSwitchBar mainSwitchBar2 = this.d;
        if (mainSwitchBar2 != null) {
            mainSwitchBar2.c(this.q);
            MainSwitchBar mainSwitchBar3 = this.d;
            mainSwitchBar3.setVisibility(0);
            mainSwitchBar3.b.setOnCheckedChangeListener(mainSwitchBar3);
        }
        for (ata ataVar : this.c) {
            this.d.a(ataVar);
        }
    }

    @Override // defpackage.ata
    public final void ff(boolean z) {
        super.k(z);
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        super.k(z);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar == null || mainSwitchBar.d() == z) {
            return;
        }
        this.d.b(z);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ag(context, attributeSet);
    }
}
