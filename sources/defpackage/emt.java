package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: emt  reason: default package */
/* loaded from: classes.dex */
public final class emt implements huj {
    private final huk a;

    public emt(huk hukVar) {
        this.a = hukVar;
    }

    @Override // defpackage.huj
    public final void w() {
        end b = ene.b();
        if (b == null) {
            return;
        }
        hui[] i = this.a.i();
        if (i.length == 0) {
            b.d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (hui huiVar : i) {
            String a = huiVar.a();
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            b.d = null;
        } else {
            b.d = mhn.b((String[]) arrayList.toArray(new String[arrayList.size()]), 0);
        }
    }
}
