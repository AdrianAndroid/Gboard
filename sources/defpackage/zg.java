package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zg  reason: default package */
/* loaded from: classes2.dex */
public final class zg extends zj {
    public zg(Class cls) {
        super(R.id.f129400_resource_name_obfuscated_res_0x7f0b215b, cls, 64, 30);
    }

    @Override // defpackage.zj
    public final /* synthetic */ Object a(View view) {
        return zy.a(view);
    }

    @Override // defpackage.zj
    public final /* synthetic */ void b(View view, Object obj) {
        zy.b(view, (CharSequence) obj);
    }

    @Override // defpackage.zj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
