package defpackage;

import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ckk  reason: default package */
/* loaded from: classes.dex */
public final class ckk implements cjb {
    private final oiy a;
    private final iqe b = iqe.a(cit.y);

    public ckk(oiy oiyVar) {
        this.a = oiyVar;
    }

    @Override // defpackage.cjb
    public final /* bridge */ /* synthetic */ cja a(EditorInfo editorInfo, llp llpVar) {
        if (!((csd) this.a).c().aj(R.string.f160750_resource_name_obfuscated_res_0x7f14066b)) {
            return null;
        }
        if (ham.z(this.b, editorInfo)) {
            boolean ah = lre.ah(llpVar, bzg.g);
            long longValue = ah ? ((Long) cit.u.c()).longValue() : 2L;
            boolean booleanValue = ((Boolean) cit.r.c()).booleanValue();
            int size = llpVar.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                mse mseVar = (mse) llpVar.get(i);
                int b = msc.b(mseVar.c);
                if (b == 0) {
                    b = 1;
                }
                int i2 = b - 1;
                if (i2 == 3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mseVar);
                    if (arrayList.size() >= longValue) {
                        return ckj.d(arrayList, ah);
                    }
                } else if (i2 == 20 && booleanValue && (arrayList == null || arrayList.isEmpty())) {
                    cki c = ckj.c();
                    c.c(mseVar);
                    c.d(llp.r(mseVar));
                    c.e(ah);
                    return c.a();
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                return ckj.d(arrayList, ah);
            }
            return null;
        }
        String str = editorInfo.packageName;
        return null;
    }

    @Override // defpackage.cjb, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
