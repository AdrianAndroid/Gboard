package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bvv  reason: default package */
/* loaded from: classes.dex */
public final class bvv implements mka {
    final /* synthetic */ SparseArray a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ClipboardKeyboard c;

    public bvv(ClipboardKeyboard clipboardKeyboard, SparseArray sparseArray, boolean z) {
        this.c = clipboardKeyboard;
        this.a = sparseArray;
        this.b = z;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) ClipboardKeyboard.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard$1", "onFailure", (char) 646, "ClipboardKeyboard.java")).t("Failed to update pinned state for an item.");
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        Void r7 = (Void) obj;
        bvf bvfVar = this.c.c;
        if (bvfVar != null) {
            SparseArray sparseArray = this.a;
            boolean z = this.b;
            bvfVar.z(sparseArray, false);
            if (z) {
                i = bvfVar.p.indexOf(buk.b) + 1;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(bvf.x(sparseArray, false));
                arrayList.addAll(bvf.x(sparseArray, true));
                bvfVar.B(sparseArray, arrayList, i);
            } else {
                List x = bvf.x(sparseArray, false);
                int indexOf = bvfVar.p.indexOf(buk.a) + 1;
                bvfVar.B(sparseArray, x, indexOf);
                bvfVar.B(sparseArray, bvf.x(sparseArray, true), bvfVar.p.indexOf(buk.c) + 1);
                i = indexOf;
            }
            bvfVar.H(true);
            RecyclerView recyclerView = bvfVar.k;
            if (recyclerView != null) {
                recyclerView.ae(i);
            }
            bvfVar.C();
            ino M = ino.M(bvfVar.f);
            int i2 = bvfVar.q;
            M.t(R.string.f160590_resource_name_obfuscated_res_0x7f140658, i2 == 0 ? System.currentTimeMillis() : ((buk) bvfVar.p.get(i2)).e);
        }
    }
}
