package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: bvr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bvr implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bvr(bvt bvtVar, Context context, imn imnVar, View view, int i) {
        this.e = i;
        this.a = bvtVar;
        this.b = context;
        this.c = imnVar;
        this.d = view;
    }

    public bvr(gf gfVar, nwo nwoVar, MenuItem menuItem, gm gmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = i;
        this.b = gfVar;
        this.d = nwoVar;
        this.c = menuItem;
        this.a = gmVar;
    }

    public /* synthetic */ bvr(iny inyVar, guu guuVar, String str, Intent intent, int i) {
        this.e = i;
        this.a = inyVar;
        this.d = guuVar;
        this.c = str;
        this.b = intent;
    }

    public bvr(nxu nxuVar, nvu nvuVar, nyv nyvVar, num numVar, int i) {
        this.e = i;
        this.a = nxuVar;
        this.d = nvuVar;
        this.c = nyvVar;
        this.b = numVar;
    }

    public bvr(nzs nzsVar, nvu nvuVar, nyv nyvVar, num numVar, int i) {
        this.e = i;
        this.c = nzsVar;
        this.d = nvuVar;
        this.a = nyvVar;
        this.b = numVar;
    }

    public bvr(odz odzVar, nvu nvuVar, nyv nyvVar, num numVar, int i) {
        this.e = i;
        this.c = odzVar;
        this.d = nvuVar;
        this.a = nyvVar;
        this.b = numVar;
    }

    public bvr(ofe ofeVar, ofc ofcVar, ofd ofdVar, Object obj, int i) {
        this.e = i;
        this.a = ofeVar;
        this.b = ofcVar;
        this.d = ofdVar;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, android.view.MenuItem] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, imn] */
    /* JADX WARN: Type inference failed for: r2v5, types: [guu, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Object obj = this.a;
                bvt bvtVar = (bvt) obj;
                bvtVar.r((Context) this.b, this.c, (View) this.d);
                return;
            case 1:
                Object obj2 = this.d;
                if (obj2 != null) {
                    ((gf) this.b).a.f = true;
                    ((gm) ((nwo) obj2).c).i(false);
                    ((gf) this.b).a.f = false;
                }
                ?? r0 = this.c;
                if (!r0.isEnabled() || !r0.hasSubMenu()) {
                    return;
                }
                ((gm) this.a).z(r0, 4);
                return;
            case 2:
                Object obj3 = this.a;
                ?? r2 = this.d;
                Object obj4 = this.c;
                Object obj5 = this.b;
                ((an) obj3).C().hB().V();
                Intent intent = (Intent) obj5;
                r2.x((String) obj4, intent.getBundleExtra(":android:show_fragment_args"), intent.getIntExtra(":android:show_fragment_title", 0), intent.getStringExtra(":android:show_fragment_title"), null);
                return;
            case 3:
                Object obj6 = this.a;
                Object obj7 = this.d;
                nvu nvuVar = (nvu) obj7;
                nxu nxuVar = (nxu) obj6;
                nxuVar.d(nvuVar, (nyv) this.c, (num) this.b);
                return;
            case 4:
                nyw nywVar = ((nzs) this.c).a;
                Object obj8 = this.d;
                nvu nvuVar2 = (nvu) obj8;
                nywVar.a(nvuVar2, (nyv) this.a, (num) this.b);
                return;
            case 5:
                oec.w(((odz) this.c).b);
                nyw nywVar2 = ((odz) this.c).b.u;
                Object obj9 = this.d;
                nvu nvuVar3 = (nvu) obj9;
                nywVar2.a(nvuVar3, (nyv) this.a, (num) this.b);
                return;
            case 6:
                oec.w(((odz) this.c).b);
                nyw nywVar3 = ((odz) this.c).b.u;
                Object obj10 = this.d;
                nvu nvuVar4 = (nvu) obj10;
                nywVar3.a(nvuVar4, (nyv) this.a, (num) this.b);
                return;
            case 7:
                oec.w(((odz) this.c).b);
                nyw nywVar4 = ((odz) this.c).b.u;
                Object obj11 = this.d;
                nvu nvuVar5 = (nvu) obj11;
                nywVar4.a(nvuVar5, (nyv) this.a, (num) this.b);
                return;
            default:
                synchronized (this.a) {
                    if (((ofc) this.b).b == 0) {
                        this.d.b(this.c);
                        ((ofe) this.a).a.remove(this.d);
                        if (((ofe) this.a).a.isEmpty()) {
                            ((ofe) this.a).b.shutdown();
                            ((ofe) this.a).b = null;
                        }
                    }
                }
                return;
        }
    }
}
