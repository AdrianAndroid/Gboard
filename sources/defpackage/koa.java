package defpackage;

import android.view.View;
import com.google.android.libraries.stickers.megamode.MegamodeView;

/* compiled from: PG */
/* renamed from: koa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class koa implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ koa(cfz cfzVar, String str, int i) {
        this.c = i;
        this.a = cfzVar;
        this.b = str;
    }

    public /* synthetic */ koa(MegamodeView megamodeView, njs njsVar, int i) {
        this.c = i;
        this.a = megamodeView;
        this.b = njsVar;
    }

    public /* synthetic */ koa(kob kobVar, njr njrVar, int i) {
        this.c = i;
        this.a = kobVar;
        this.b = njrVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            koc kocVar = ((kob) obj).t;
            kod kodVar = kocVar.e;
            if (kodVar != null) {
                kodVar.m(kocVar.d, (njr) obj2);
            }
            return true;
        } else if (i != 1) {
            Object obj3 = this.a;
            Object obj4 = this.b;
            kod kodVar2 = ((MegamodeView) obj3).k;
            if (kodVar2 != null) {
                njs njsVar = (njs) obj4;
                njr njrVar = njsVar.e;
                if (njrVar == null) {
                    njrVar = njr.d;
                }
                kodVar2.m(njsVar, njrVar);
            }
            return true;
        } else {
            Object obj5 = this.a;
            Object obj6 = this.b;
            cfz cfzVar = (cfz) obj5;
            idk idkVar = cfzVar.g;
            cgd cgdVar = cgd.SUGGESTION_LONG_PRESSED;
            Object[] objArr = new Object[3];
            objArr[0] = obj6;
            objArr[1] = "android:autofill".equals(obj6) ? cfzVar.m() : null;
            objArr[2] = cfz.r();
            idkVar.e(cgdVar, objArr);
            return true;
        }
    }
}
