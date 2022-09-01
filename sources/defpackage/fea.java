package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fea  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fea implements fdw {
    private final /* synthetic */ int c;
    public static final /* synthetic */ fea b = new fea(1);
    public static final /* synthetic */ fea a = new fea(0);

    private /* synthetic */ fea(int i) {
        this.c = i;
    }

    @Override // defpackage.fdw
    public final boolean a(Context context, fbr fbrVar, ino inoVar) {
        if (this.c != 0) {
            long j = fdu.a;
            return !fdy.c(inoVar) && inoVar.x(R.string.f162190_resource_name_obfuscated_res_0x7f1406fc, false) && fao.n(context, fbrVar.a());
        }
        ltg ltgVar = feb.a;
        return !fdy.c(inoVar);
    }
}
