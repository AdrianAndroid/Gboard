package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zh  reason: default package */
/* loaded from: classes2.dex */
public final class zh extends zj {
    public zh(Class cls) {
        super(R.id.f129340_resource_name_obfuscated_res_0x7f0b2155, cls);
    }

    @Override // defpackage.zj
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(zw.h(view));
    }

    @Override // defpackage.zj
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        zw.e(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.zj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
