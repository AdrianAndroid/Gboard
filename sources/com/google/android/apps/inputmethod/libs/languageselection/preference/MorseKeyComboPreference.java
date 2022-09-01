package com.google.android.apps.inputmethod.libs.languageselection.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MorseKeyComboPreference extends DialogPreferenceCompat implements DialogInterface.OnKeyListener {
    private static final int[] K = {R.string.f161990_resource_name_obfuscated_res_0x7f1406e8, R.string.f161960_resource_name_obfuscated_res_0x7f1406e5};
    public final ArrayAdapter g;
    public Button h;
    public Set i;

    public MorseKeyComboPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayAdapter(context, 17367043, new ArrayList());
        ((DialogPreference) this).f = R.layout.f135220_resource_name_obfuscated_res_0x7f0e00f5;
    }

    private static Preference ag(Long l, Context context, String str, aip aipVar) {
        int[] iArr = K;
        int length = iArr.length;
        for (int i = 0; i < 2; i++) {
            String string = context.getString(iArr[i]);
            if (!str.equals(string)) {
                Preference d = aipVar.d(str);
                if ((d instanceof MorseKeyComboPreference) && dmt.c(context, string).contains(l)) {
                    return d;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void ae(cv cvVar) {
        if (this.j.getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
            cvVar.b(-1).setFocusable(false);
            cvVar.b(-2).setFocusable(false);
        }
    }

    public final boolean af() {
        return !this.g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.e());
        Set set = this.i;
        if (set != null) {
            bundle.putLongArray("key_combos", mhq.f(set));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        List mhiVar;
        Bundle bundle = (Bundle) parcelable;
        if (bundle.containsKey("key_combos")) {
            long[] longArray = bundle.getLongArray("key_combos");
            int length = longArray.length;
            if (length == 0) {
                mhiVar = Collections.emptyList();
            } else {
                mhiVar = new mhi(longArray, 0, length);
            }
            HashSet hashSet = new HashSet(mhiVar);
            this.i = hashSet;
            dmt.e(this.g, hashSet, this.j);
        }
        super.g(bundle.getParcelable("super_state"));
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void k(View view) {
        CharSequence m = super.m();
        if (m != null) {
            ((AppCompatTextView) view.findViewById(R.id.f56940_resource_name_obfuscated_res_0x7f0b02bf)).setText(m);
        }
        this.h = (Button) view.findViewById(R.id.f56970_resource_name_obfuscated_res_0x7f0b02c2);
        if (this.j.getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
            this.h.setFocusable(false);
        }
        this.h.setOnClickListener(new cjr(this, 15));
        ListView listView = (ListView) view.findViewById(R.id.f56960_resource_name_obfuscated_res_0x7f0b02c1);
        if (this.i == null) {
            this.i = new HashSet(dmt.c(this.j, this.t));
        }
        dmt.e(this.g, this.i, this.j);
        listView.setAdapter((ListAdapter) this.g);
        this.h.setEnabled(af());
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        lmz c = dmt.c(this.j, this.t);
        int size = c.size();
        if (size != 1) {
            return this.j.getResources().getQuantityString(R.plurals.f147200_resource_name_obfuscated, size, Integer.valueOf(size));
        }
        return dmt.d(((Long) c.iterator().next()).longValue(), this.j);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void o(cu cuVar) {
        cuVar.k(this.q);
        cuVar.m(this);
        cuVar.n(R.string.f163210_resource_name_obfuscated_res_0x7f14076e, this);
        cuVar.l(17039360, this);
        cuVar.e(null);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        char c;
        if (keyEvent.getAction() == 1) {
            if (i != 4) {
                Context context = this.j;
                String str = this.t;
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 62 || keyCode == 67 || keyCode == 66) {
                    c = 0;
                } else {
                    if (!KeyEvent.isModifierKey(keyCode)) {
                        Long valueOf = Long.valueOf(dmt.a(keyEvent));
                        if (!this.i.remove(valueOf)) {
                            if (ag(valueOf, context, str, this.k) != null) {
                                c = 1;
                            } else {
                                this.i.add(valueOf);
                                dmt.e(this.g, this.i, context);
                            }
                        } else {
                            dmt.e(this.g, this.i, context);
                        }
                    }
                    c = 2;
                }
                if (c == 1) {
                    long a = dmt.a(keyEvent);
                    Preference ag = ag(Long.valueOf(a), this.j, this.t, this.k);
                    String str2 = ag == null ? "" : ag.q;
                    Context context2 = this.j;
                    Toast.makeText(this.j, context2.getString(R.string.f176590_resource_name_obfuscated_res_0x7f140ce5, dmt.d(a, context2), str2), 0).show();
                } else {
                    this.h.setEnabled(af());
                    return c != 0;
                }
            } else {
                dialogInterface.dismiss();
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void l(boolean z) {
        Set set;
        if (!z || (set = this.i) == null) {
            this.i = new HashSet(dmt.c(this.j, this.t));
            return;
        }
        Set hashSet = new HashSet(set.size());
        for (Long l : this.i) {
            hashSet.add(l.toString());
        }
        ac(hashSet);
        U(hashSet);
        d();
    }
}
