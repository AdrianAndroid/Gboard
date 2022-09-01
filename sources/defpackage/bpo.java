package defpackage;

import com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bpo  reason: default package */
/* loaded from: classes.dex */
public final class bpo implements ibr {
    private final List a = new ArrayList();
    private final int b;
    private LatinPrimeKeyboard c;

    public bpo(int i, LatinPrimeKeyboard latinPrimeKeyboard) {
        this.b = i;
        this.c = latinPrimeKeyboard;
    }

    public final void a() {
        LatinPrimeKeyboard latinPrimeKeyboard = this.c;
        ltg ltgVar = LatinPrimeKeyboard.c;
        latinPrimeKeyboard.g = null;
        this.c = null;
    }

    @Override // defpackage.ibr
    public final void b(ibm ibmVar) {
        if (this.c == null || ibmVar == null) {
            return;
        }
        this.a.add(ibmVar.b(ice.BODY, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b));
        if (this.a.size() != this.b) {
            return;
        }
        this.c.ah(ice.BODY, true).i(this.a);
        a();
    }
}
