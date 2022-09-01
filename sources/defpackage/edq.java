package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: edq  reason: default package */
/* loaded from: classes.dex */
public final class edq extends dz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/gif/GifInfiniteScrollFetcher");
    public hix b;
    public edo c;
    public VerticalScrollAnimatedImageSidebarHolderView d;
    public ViewGroup e;
    private hja f;
    private mko g;

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (!(i == 0 && i2 == 0) && h(recyclerView)) {
            f();
        }
    }

    public final void d(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, hja hjaVar, edo edoVar) {
        if (this.d != null) {
            e();
        }
        this.d = verticalScrollAnimatedImageSidebarHolderView;
        this.e = viewGroup;
        this.f = hjaVar;
        this.c = edoVar;
        verticalScrollAnimatedImageSidebarHolderView.az(this);
        f();
    }

    public final void e() {
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.d;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            verticalScrollAnimatedImageSidebarHolderView.aC(this);
            this.d = null;
        }
        this.e = null;
        this.c = null;
        this.f = null;
        hix hixVar = this.b;
        if (hixVar != null) {
            hixVar.close();
            this.b = null;
        }
        hji.h(this.g);
        this.g = null;
    }

    public final void f() {
        ViewGroup viewGroup;
        edo edoVar;
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.d;
        if (verticalScrollAnimatedImageSidebarHolderView != null && (viewGroup = this.e) != null && (edoVar = this.c) != null) {
            edoVar.b(verticalScrollAnimatedImageSidebarHolderView, viewGroup);
        }
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 14));
        e2.h(new dys(this, 15));
        e3.h(new dys(this, 15));
        hix a2 = hjg.a(gyc.b, null, afpVar, z, e, e2, e3);
        this.b = a2;
        hiz b = hjg.b(this.f);
        b.E(a2);
        this.g = b;
    }

    public final void g(Throwable th) {
        ViewGroup viewGroup;
        edo edoVar;
        edp edpVar;
        ((ltd) ((ltd) ((ltd) a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/search/gif/GifInfiniteScrollFetcher", "onFailure", (char) 167, "GifInfiniteScrollFetcher.java")).t("Failed to fetch images");
        this.b = null;
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.d;
        if (verticalScrollAnimatedImageSidebarHolderView == null || (viewGroup = this.e) == null || (edoVar = this.c) == null) {
            return;
        }
        if (th instanceof NoSuchElementException) {
            edpVar = edp.NO_RESULTS;
        } else if ((th instanceof TimeoutException) || (th instanceof InterruptedException) || (th instanceof CancellationException)) {
            edpVar = edp.SERVER_ERROR;
        } else if (!(th instanceof iht)) {
            edpVar = edp.NO_RESULTS;
        } else {
            int i = ((iht) th).a.a().b;
            int i2 = ((i < 100 || i >= 200) ? (i < 200 || i >= 300) ? (i < 300 || i >= 400) ? (i < 400 || i >= 500) ? (i < 500 || i >= 600) ? 1 : 6 : 5 : 4 : 3 : 2) - 1;
            if (i2 == 0) {
                edpVar = edp.NO_NETWORK;
            } else if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                edpVar = edp.SERVER_ERROR;
            } else {
                edpVar = edp.CLIENT_ERROR;
            }
        }
        edoVar.a(verticalScrollAnimatedImageSidebarHolderView, viewGroup, edpVar);
    }

    public final boolean h(RecyclerView recyclerView) {
        return !hji.e(this.g) && this.b == null && hjg.h(this.f) && cur.b(recyclerView.m);
    }
}
