package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahm  reason: default package */
/* loaded from: classes.dex */
public final class ahm extends Preference {
    private long a;

    public ahm(Context context, List list, long j) {
        super(context);
        this.F = R.layout.f134330_resource_name_obfuscated_res_0x7f0e0092;
        Drawable a = ej.a(this.j, R.drawable.f47140_resource_name_obfuscated_res_0x7f0801b8);
        if (this.s != a) {
            this.s = a;
            this.r = 0;
            d();
        }
        this.r = R.drawable.f47140_resource_name_obfuscated_res_0x7f0801b8;
        P(R.string.f151790_resource_name_obfuscated_res_0x7f140239);
        M(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.I)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.j.getString(R.string.f174620_resource_name_obfuscated_res_0x7f140c19, str, charSequence);
            }
        }
        n(str);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        aisVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long eZ() {
        return this.a;
    }
}
