package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hbm  reason: default package */
/* loaded from: classes.dex */
public final class hbm implements hdi {
    private final List a;
    private final ino b;
    private final Context c;
    private final opu d;

    public hbm(Context context, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ArrayList arrayList;
        this.c = context;
        this.d = opuVar;
        ino K = ino.K(context, null);
        this.b = K;
        String d = K.d("pref_key_recent_emoji", "");
        if (TextUtils.isEmpty(d)) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(lfy.c(',').k(d));
        }
        this.a = arrayList;
    }

    @Override // defpackage.hdi
    public final hiz a() {
        return hiz.n(llp.o(this.a));
    }

    @Override // defpackage.hdj
    public final /* synthetic */ hiz b() {
        return hyq.n(this);
    }

    @Override // defpackage.hdj
    public final String c() {
        return this.c.getString(R.string.f150750_resource_name_obfuscated_res_0x7f1401c1);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String sb;
        ino inoVar = this.b;
        List<String> list = this.a;
        if (list.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (String str : list) {
                sb2.append(str);
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb = sb2.toString();
        }
        inoVar.j("pref_key_recent_emoji", sb);
    }

    @Override // defpackage.hdj
    public final /* synthetic */ void d(hel helVar) {
        hyq.o(this, helVar);
    }

    @Override // defpackage.hdi
    public final void e(String str) {
        this.a.remove(str);
        this.a.add(0, str);
        ((RecyclerView) this.d.a).L();
    }

    @Override // defpackage.hdj
    public final void f() {
    }
}
