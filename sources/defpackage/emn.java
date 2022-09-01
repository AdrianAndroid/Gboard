package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: emn  reason: default package */
/* loaded from: classes.dex */
final class emn extends hst {
    final /* synthetic */ emp a;

    public emn(emp empVar) {
        this.a = empVar;
    }

    @Override // defpackage.hst
    public final void a() {
        emj emjVar;
        els elsVar = this.a.c;
        if (elsVar == null || (emjVar = elsVar.b) == null) {
            return;
        }
        if (emjVar.isShowing()) {
            elsVar.b.dismiss();
        }
        elsVar.b = null;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        if (editorInfo2 == null) {
            emp empVar = this.a;
            hqt b = hqp.b();
            if (b == null) {
                return;
            }
            Context a = b.a();
            if (!a.getResources().getBoolean(R.bool.f19350_resource_name_obfuscated_res_0x7f05000b) || empVar.d()) {
                return;
            }
            String m = ham.m(editorInfo);
            if (TextUtils.isEmpty(m)) {
                ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "isEnabledForHostApp", 198, "SharingNoticeModule.java")).t("Empty app package name. Sharing notice will not show.");
            } else if (!empVar.d.j(m)) {
            } else {
                long c = empVar.b.c("sharing_notice_earliest_display_time", 0L);
                if (c != 0) {
                    if (System.currentTimeMillis() < c) {
                        return;
                    }
                    if (empVar.g) {
                        ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "shouldPostNotice", 177, "SharingNoticeModule.java")).t("NoticeManager already has sharing notice.");
                        return;
                    }
                    int c2 = empVar.c();
                    long longValue = ((Long) emb.g.c()).longValue();
                    if (c2 < longValue) {
                        if (System.currentTimeMillis() - empVar.b.c("sharing_notice_latest_display_time", 0L) <= ((Long) emb.e.c()).longValue()) {
                            return;
                        }
                        if (empVar.c == null) {
                            empVar.c = new els(a);
                        }
                        hkr a2 = hkt.a();
                        a2.d(R.layout.f146130_resource_name_obfuscated_res_0x7f0e0599);
                        a2.i(a.getString(R.string.f159160_resource_name_obfuscated_res_0x7f1405a7, b.n(1)));
                        a2.e("tag_share_gboard_notice");
                        a2.f(((Long) emb.h.c()).longValue());
                        a2.e = new ega(empVar, 18);
                        a2.c = new ega(empVar, 19);
                        a2.a = new ega(empVar, 20);
                        a2.b = new emq(empVar, 1);
                        a2.f = bon.e;
                        hkv.b(a2.a());
                        empVar.e = false;
                        empVar.f = b.i();
                        return;
                    }
                    ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "shouldPostNotice", 183, "SharingNoticeModule.java")).X(longValue, c2);
                    return;
                }
                empVar.b.i("sharing_notice_earliest_display_time", System.currentTimeMillis() + ((Long) emb.f.c()).longValue());
            }
        }
    }
}
