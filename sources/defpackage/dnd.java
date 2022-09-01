package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: dnd  reason: default package */
/* loaded from: classes.dex */
public final class dnd extends dnn {
    @Override // defpackage.dnn, defpackage.an
    public final void P(int i, int i2, Intent intent) {
        inx aE;
        if (i2 != -1 || (aE = aE()) == null) {
            return;
        }
        aE.y(this, -1, new Intent());
    }

    @Override // defpackage.dnn, defpackage.aih
    public final void o(Bundle bundle, String str) {
        super.o(bundle, str);
        ArrayList parcelableArrayList = fV().getParcelableArrayList("sub_menu_language_list_key");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            aE().y(this, 0, new Intent());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(dne.az(this, (jav) parcelableArrayList.get(i)));
        }
        Collections.sort(arrayList, new dnc());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Preference preference = (Preference) arrayList.get(i2);
            preference.M(Integer.MAX_VALUE);
            this.am.ah(preference);
        }
    }
}
