package defpackage;

import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: evt  reason: default package */
/* loaded from: classes.dex */
public final class evt implements ewe, hho, inm {
    private static final hhl[] a = {evs.a};
    private final ino b;
    private volatile boolean c;
    private volatile boolean d;

    public evt() {
        ino L = ino.L();
        this.b = L;
        hhq.p(this, a);
        L.Z(this, R.string.f162280_resource_name_obfuscated_res_0x7f140705, R.string.f162700_resource_name_obfuscated_res_0x7f140730);
        e();
    }

    private final void e() {
        boolean booleanValue = ((Boolean) evs.a.c()).booleanValue();
        boolean aj = this.b.aj(R.string.f162280_resource_name_obfuscated_res_0x7f140705);
        boolean aj2 = this.b.aj(R.string.f162700_resource_name_obfuscated_res_0x7f140730);
        boolean z = false;
        if ((aj || aj2) && booleanValue) {
            z = true;
        }
        this.c = z;
    }

    @Override // defpackage.ewe
    public final void c(jav javVar, EditorInfo editorInfo, boolean z) {
        boolean z2 = false;
        if (!z && javVar.equals(exr.a) && ham.ao(editorInfo) && !ham.O(editorInfo) && irs.d()) {
            z2 = true;
        }
        this.d = z2;
        ham.ao(editorInfo);
        ham.O(editorInfo);
        irs.d();
        javVar.equals(exr.a);
    }

    @Override // defpackage.ewe
    public final boolean d() {
        return this.c && this.d;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        e();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        e();
    }
}
