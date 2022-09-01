package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dob  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dob implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dob(InputConnection inputConnection, int i, int i2) {
        this.c = i2;
        this.b = inputConnection;
        this.a = i;
    }

    public /* synthetic */ dob(BindingRecyclerView bindingRecyclerView, int i, int i2) {
        this.c = i2;
        this.b = bindingRecyclerView;
        this.a = i;
    }

    public /* synthetic */ dob(LatinIme latinIme, int i, int i2) {
        this.c = i2;
        this.b = latinIme;
        this.a = i;
    }

    public /* synthetic */ dob(dcu dcuVar, int i, int i2) {
        this.c = i2;
        this.b = dcuVar;
        this.a = i;
    }

    public /* synthetic */ dob(ezb ezbVar, int i, int i2) {
        this.c = i2;
        this.b = ezbVar;
        this.a = i;
    }

    public /* synthetic */ dob(fca fcaVar, int i, int i2) {
        this.c = i2;
        this.b = fcaVar;
        this.a = i;
    }

    public dob(fpg fpgVar, int i, int i2) {
        this.c = i2;
        this.b = fpgVar;
        this.a = i;
    }

    public /* synthetic */ dob(gqa gqaVar, int i, int i2) {
        this.c = i2;
        this.b = gqaVar;
        this.a = i;
    }

    public /* synthetic */ dob(itp itpVar, int i, int i2) {
        this.c = i2;
        this.b = itpVar;
        this.a = i;
    }

    public /* synthetic */ dob(joo jooVar, int i, int i2) {
        this.c = i2;
        this.b = jooVar;
        this.a = i;
    }

    public dob(nxu nxuVar, int i, int i2) {
        this.c = i2;
        this.b = nxuVar;
        this.a = i;
    }

    public dob(nzo nzoVar, int i, int i2) {
        this.c = i2;
        this.b = nzoVar;
        this.a = i;
    }

    public dob(nzt nztVar, int i, int i2) {
        this.c = i2;
        this.b = nztVar;
        this.a = i;
    }

    public dob(oxl oxlVar, int i, int i2) {
        this.c = i2;
        this.b = oxlVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fbk fbkVar;
        View view;
        switch (this.c) {
            case 0:
                LatinIme latinIme = (LatinIme) this.b;
                latinIme.i.c(this.a);
                latinIme.A.c();
                latinIme.k(false, true, 6);
                return;
            case 1:
                ((dcu) this.b).bq(this.a - 1);
                return;
            case 2:
                ((RecyclerView) this.b).Y(this.a);
                return;
            case 3:
                ((RecyclerView) this.b).Y(this.a);
                return;
            case 4:
                ((ezb) this.b).d(this.a);
                return;
            case 5:
                Object obj = this.b;
                int i = this.a;
                fey feyVar = ((fca) obj).c;
                if (feyVar == null || (view = (fbkVar = (fbk) feyVar).c) == null || view.getVisibility() != 0) {
                    return;
                }
                fbkVar.g.e = i;
                return;
            case 6:
                ((fpg) this.b).k(this.a);
                return;
            case 7:
                Object obj2 = this.b;
                int i2 = this.a;
                gqa gqaVar = (gqa) obj2;
                gqaVar.u();
                gqaVar.z(i2 - 1);
                return;
            case 8:
                ?? r0 = this.b;
                int i3 = this.a;
                ltg ltgVar = hpr.a;
                hpw.a.b("performContextMenuAction(%d)", Integer.valueOf(i3));
                r0.performContextMenuAction(i3);
                return;
            case 9:
                ?? r02 = this.b;
                int i4 = this.a;
                ltg ltgVar2 = hpr.a;
                hpw.a.b("performEditorAction(%d)", Integer.valueOf(i4));
                r02.performEditorAction(i4);
                return;
            case 10:
                ((itp) this.b).c.b(this.a);
                return;
            case 11:
                Object obj3 = this.b;
                job b = job.b(this.a);
                jdg.u(b);
                joo jooVar = (joo) obj3;
                jooVar.a.g(b, jooVar.b);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj4 = this.b;
                jnx b2 = jnx.b(this.a);
                jdg.u(b2);
                joo jooVar2 = (joo) obj4;
                jooVar2.a.f(b2, jooVar2.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i5 = oiw.a;
                try {
                    nzi nziVar = ((nxu) this.b).a;
                    int i6 = this.a;
                    jdg.w(true, "numMessages must be > 0");
                    if (((ocu) nziVar).b()) {
                        return;
                    }
                    ((ocu) nziVar).e += i6;
                    ((ocu) nziVar).a();
                    return;
                } catch (Throwable th) {
                    ((nxu) this.b).n(th);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((nzo) this.b).b.d(this.a);
                return;
            case 15:
                ((nzt) this.b).f.g(this.a);
                return;
            case 16:
                ((nzt) this.b).f.k(this.a);
                return;
            case 17:
                ((nzt) this.b).f.l(this.a);
                return;
            default:
                ((oxl) this.b).onStatus(this.a);
                return;
        }
    }
}
