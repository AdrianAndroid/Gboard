package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hst  reason: default package */
/* loaded from: classes.dex */
public class hst implements ijj {
    public void a() {
    }

    public void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
    }

    public void d() {
    }

    public void e(EditorInfo editorInfo, boolean z) {
    }

    public final void f(Executor executor) {
        ijl.b().h(this, hsu.class, executor);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        hsu hsuVar = (hsu) ijgVar;
        int i = hsuVar.a;
        if (i == 0) {
            EditorInfo editorInfo = hsuVar.b;
            if (editorInfo == null) {
                return;
            }
            boolean z = hsuVar.d;
            e(editorInfo, hsuVar.f);
        } else if (i != 1) {
            if (i != 2) {
                d();
                return;
            }
            boolean z2 = hsuVar.e;
            a();
        } else {
            EditorInfo editorInfo2 = hsuVar.b;
            if (editorInfo2 == null) {
                return;
            }
            EditorInfo editorInfo3 = hsuVar.c;
            boolean z3 = hsuVar.d;
            b(editorInfo2, editorInfo3, hsuVar.f);
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g(Executor executor) {
        ijl.b().c(this, hsu.class, executor);
    }

    public final void h() {
        ijl.b().d(this, hsu.class);
    }
}
