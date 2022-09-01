package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hmz  reason: default package */
/* loaded from: classes.dex */
public final class hmz implements Handler.Callback, AutoCloseable, hls {
    private long a;
    private long b;
    private final HandlerThread c;
    private final Handler d;
    private final idk e;
    private hlp f;
    private final hls g;
    private int h;
    private int i;
    private int j;
    private hmr k;
    private Message l;
    private boolean m;
    private final hmi n;

    public hmz(hmi hmiVar, idk idkVar, hls hlsVar) {
        HandlerThread handlerThread = new HandlerThread("AsyncIme");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper(), this);
        this.n = hmiVar;
        this.e = idkVar;
        this.g = hlsVar;
        p(1, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(Message message) {
        if (message.obj instanceof gwb) {
            ((gwb) message.obj).a();
        }
    }

    private final void q(int i, int i2, int i3, Object obj) {
        if (!this.m) {
            this.n.b(i, i2, i3, obj);
            return;
        }
        if (this.k == null) {
            hmr hmrVar = (hmr) hmr.a.a();
            if (hmrVar == null) {
                hmrVar = new hmr();
            }
            this.k = hmrVar;
        }
        if (i != 102) {
            if (i == 104) {
                i = 104;
            }
            this.k.add(Message.obtain(null, i, i2, i3, obj));
        }
        int size = this.k.size();
        int i4 = 0;
        while (i4 < size) {
            Message message = (Message) this.k.get(i4);
            if (message.what == i) {
                this.k.remove(i4);
                message.recycle();
                size--;
            } else {
                i4++;
            }
        }
        this.k.add(Message.obtain(null, i, i2, i3, obj));
    }

    private final void s() {
        hmr hmrVar = this.k;
        if (hmrVar != null && !hmrVar.isEmpty()) {
            this.n.b(100, this.h, 0, this.k);
        }
        this.k = null;
    }

    @Override // defpackage.hlq
    public final void B() {
        q(120, this.h, 0, null);
    }

    @Override // defpackage.hlq
    public final void C(int i, int i2) {
        q(119, this.h, i, Integer.valueOf(i2));
    }

    @Override // defpackage.hlq
    public final void D() {
        q(113, this.h, 0, null);
    }

    @Override // defpackage.hlq
    public final void G() {
        q(116, this.h, 0, null);
    }

    @Override // defpackage.hlq
    public final void M(int i, int i2) {
        int i3 = this.h;
        hms hmsVar = (hms) hms.a.a();
        if (hmsVar == null) {
            hmsVar = new hms();
        }
        hmsVar.b = i;
        hmsVar.c = i2;
        q(115, i3, 0, hmsVar);
    }

    @Override // defpackage.hlq
    public final void N() {
        this.g.N();
    }

    @Override // defpackage.hlq
    public final void O(hfd hfdVar) {
        q(105, this.h, 0, hfdVar);
    }

    @Override // defpackage.hlq
    public final void R(String str) {
        q(118, this.h, 0, str);
    }

    @Override // defpackage.hlq
    public final /* synthetic */ void S(CharSequence charSequence, int i, Object obj) {
        g(charSequence, i);
    }

    @Override // defpackage.hlq
    public final void T(List list) {
        int i = this.j + 1;
        this.j = i;
        q(104, this.h, i, list);
    }

    @Override // defpackage.hls
    public final lmz W() {
        return this.g.W();
    }

    @Override // defpackage.hls
    public final void Z() {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m();
        p(2, 0, null);
    }

    @Override // defpackage.hlq
    public final void f(int i, int i2, CharSequence charSequence) {
        int i3 = this.h;
        hmw hmwVar = (hmw) hmw.a.a();
        if (hmwVar == null) {
            hmwVar = new hmw();
        }
        hmwVar.b = i;
        hmwVar.c = i2;
        hmwVar.d = charSequence;
        q(111, i3, 0, hmwVar);
    }

    @Override // defpackage.hlq
    public final void g(CharSequence charSequence, int i) {
        q(101, this.h, i, charSequence);
    }

    @Override // defpackage.hls
    public final gqc h() {
        return this.g.h();
    }

    @Override // defpackage.hlt
    public final idk hO() {
        return this.e;
    }

    @Override // defpackage.hlr
    public final hqk hT(int i, int i2, int i3) {
        hmi hmiVar = this.n;
        return hqk.a((hqk) new hmh(hmiVar, hmiVar.a.c, this.h, i, i2, i3).a());
    }

    @Override // defpackage.hlq
    public final void hU(CompletionInfo completionInfo) {
        q(117, this.h, 0, completionInfo);
    }

    @Override // defpackage.hlq
    public final void hV(CharSequence charSequence, boolean z, int i) {
        int i2 = this.h;
        hmm hmmVar = (hmm) hmm.a.a();
        if (hmmVar == null) {
            hmmVar = new hmm();
        }
        hmmVar.b = charSequence;
        hmmVar.c = z;
        hmmVar.d = i;
        q(106, i2, 0, hmmVar);
    }

    @Override // defpackage.hlq
    public final void hW() {
        q(110, this.h, 0, null);
    }

    @Override // defpackage.hlq
    public final void hX(int i, int i2, CharSequence charSequence, boolean z) {
        int i3 = this.h;
        hmt hmtVar = (hmt) hmt.a.a();
        if (hmtVar == null) {
            hmtVar = new hmt();
        }
        hmtVar.b = i;
        hmtVar.c = i2;
        hmtVar.d = charSequence;
        hmtVar.e = z;
        q(107, i3, 0, hmtVar);
    }

    @Override // defpackage.hlq
    public final void hY(boolean z) {
        int i = this.i + 1;
        this.i = i;
        q(102, this.h, i, new hmx(z, this.a, this.b));
    }

    @Override // defpackage.hlq
    public final /* synthetic */ boolean hZ(hln hlnVar, boolean z) {
        return false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        synchronized (this) {
            if (this.l == message) {
                this.l = null;
            }
        }
        if (message.what == -1 || message.what == -2) {
            this.m = true;
            this.h = message.arg2;
            this.a = 0L;
            int i = message.arg1;
            if (i == 107) {
                icn icnVar = (icn) message.obj;
                hX(icnVar.a, icnVar.b, icnVar.c, false);
            } else {
                switch (i) {
                    case 1:
                        this.f = this.n.a(this);
                        break;
                    case 2:
                        gvt.a(this.f);
                        this.f = null;
                        this.c.quit();
                        return true;
                    case 3:
                        nsx nsxVar = (nsx) message.obj;
                        Object obj = nsxVar.b;
                        boolean z = nsxVar.a;
                        hlp hlpVar = this.f;
                        if (hlpVar != null) {
                            hlpVar.i((EditorInfo) obj, z);
                            break;
                        }
                        break;
                    case 4:
                        hlp hlpVar2 = this.f;
                        if (hlpVar2 != null) {
                            hlpVar2.j();
                            break;
                        }
                        break;
                    case 5:
                        hfd hfdVar = (hfd) message.obj;
                        hlp hlpVar3 = this.f;
                        if (hlpVar3 != null) {
                            hlpVar3.h(hfdVar);
                            break;
                        }
                        break;
                    case 6:
                        hlp hlpVar4 = this.f;
                        if (hlpVar4 != null) {
                            hlpVar4.gX();
                            break;
                        }
                        break;
                    case 7:
                        hmo hmoVar = (hmo) message.obj;
                        hfd hfdVar2 = hmoVar.a;
                        this.a = hfdVar2.i;
                        this.b = hmoVar.b;
                        hlp hlpVar5 = this.f;
                        if (hlpVar5 != null && !hlpVar5.B(hfdVar2)) {
                            O(hfdVar2);
                            break;
                        }
                        break;
                    case 8:
                        hmn hmnVar = (hmn) message.obj;
                        hlp hlpVar6 = this.f;
                        if (hlpVar6 != null && hmnVar.c == this.i) {
                            hlpVar6.w(hmnVar.b);
                            break;
                        }
                        break;
                    case 9:
                        hmu hmuVar = (hmu) message.obj;
                        hlp hlpVar7 = this.f;
                        if (hlpVar7 != null && hmuVar.b == this.j) {
                            hlpVar7.gV(hmuVar.a, hmuVar.c);
                            break;
                        }
                        break;
                    case 10:
                        hmu hmuVar2 = (hmu) message.obj;
                        hlp hlpVar8 = this.f;
                        if (hlpVar8 != null && hmuVar2.b == this.i) {
                            hlpVar8.gY(hmuVar2.a, hmuVar2.c);
                            break;
                        }
                        break;
                    case 11:
                        hmv hmvVar = (hmv) message.obj;
                        hlp hlpVar9 = this.f;
                        if (hlpVar9 != null) {
                            hlpVar9.p(hmvVar.b, hmvVar.c, hmvVar.d, hmvVar.e, 0);
                            break;
                        }
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        long j = ((hmq) message.obj).b;
                        long j2 = ((hmq) message.obj).c;
                        hlp hlpVar10 = this.f;
                        if (hlpVar10 != null) {
                            hlpVar10.a(j, j2);
                            break;
                        }
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        hln hlnVar = (hln) message.obj;
                        hlp hlpVar11 = this.f;
                        if (hlpVar11 != null) {
                            hlpVar11.gS(hlnVar);
                            break;
                        }
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        hmp hmpVar = (hmp) message.obj;
                        hlp hlpVar12 = this.f;
                        if (hlpVar12 != null) {
                            hlpVar12.l(hmpVar.b, hmpVar.c);
                            break;
                        }
                        break;
                    case 15:
                        CompletionInfo[] completionInfoArr = (CompletionInfo[]) message.obj;
                        hlp hlpVar13 = this.f;
                        if (hlpVar13 != null) {
                            hlpVar13.gT(completionInfoArr);
                            break;
                        }
                        break;
                    case 16:
                        int intValue = ((Integer) message.obj).intValue();
                        hlp hlpVar14 = this.f;
                        if (hlpVar14 != null) {
                            hlpVar14.W(intValue);
                            break;
                        }
                        break;
                }
            }
            k(message);
            hmr hmrVar = this.k;
            if (hmrVar == null || hmrVar.isEmpty()) {
                this.n.b(109, this.h, 0, null);
            } else {
                q(109, this.h, 0, null);
                s();
            }
            this.m = false;
            return true;
        }
        return false;
    }

    @Override // defpackage.hlq
    public final void hu(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        int i3 = this.h;
        hmy hmyVar = (hmy) hmy.a.a();
        if (hmyVar == null) {
            hmyVar = new hmy();
        }
        hmyVar.b = i;
        hmyVar.c = i2;
        hmyVar.d = charSequence;
        hmyVar.e = charSequence2;
        hmyVar.f = charSequence3;
        hmyVar.g = charSequence4;
        hmyVar.h = charSequence5;
        q(114, i3, 0, hmyVar);
    }

    @Override // defpackage.hlr
    public final CharSequence i(int i) {
        s();
        hmi hmiVar = this.n;
        CharSequence charSequence = (CharSequence) new hmf(hmiVar, hmiVar.a.c, this.h, i).a();
        return charSequence != null ? charSequence : "";
    }

    @Override // defpackage.hlr
    public final CharSequence j(int i) {
        s();
        hmi hmiVar = this.n;
        CharSequence charSequence = (CharSequence) new hmg(hmiVar, hmiVar.a.c, this.h, i).a();
        return charSequence != null ? charSequence : "";
    }

    @Override // defpackage.hlq
    public final void l(List list, hln hlnVar, boolean z) {
        int i = this.h;
        int i2 = this.i;
        hmk hmkVar = (hmk) hmk.a.a();
        if (hmkVar == null) {
            hmkVar = new hmk();
        }
        hmkVar.b = list;
        hmkVar.c = hlnVar;
        hmkVar.d = z;
        q(103, i, i2, hmkVar);
    }

    public final synchronized void m() {
        this.l = null;
        this.d.removeMessages(-2);
    }

    public final synchronized void p(int i, int i2, Object obj) {
        if (i == 7) {
            Message message = this.l;
            if (message != null && message.arg1 == 7 && (obj instanceof hmo)) {
                hmi hmiVar = this.n;
                hfd hfdVar = ((hmo) this.l.obj).a;
                hmo hmoVar = (hmo) obj;
                hfd hfdVar2 = hmoVar.a;
                hna c = hmiVar.a.c();
                if (c != null && c.n(hfdVar, hfdVar2)) {
                    this.l.arg2 = i2;
                    hmo hmoVar2 = (hmo) this.l.obj;
                    long j = hmoVar2.b;
                    if (j <= 0) {
                        j = hmoVar2.a.i;
                    }
                    hmoVar.b = j;
                    this.l.obj = obj;
                    return;
                }
            }
            i = 7;
        }
        Message obtainMessage = this.d.obtainMessage((i == 1 || i == 2 || i == 3 || i == 4) ? -1 : -2, i, i2, obj);
        this.l = obtainMessage;
        this.d.sendMessage(obtainMessage);
    }

    @Override // defpackage.hlq
    public final void x() {
        q(112, this.h, 0, null);
    }

    @Override // defpackage.hlq
    public final void y(long j, boolean z) {
        int i = this.h;
        hml hmlVar = (hml) hml.a.a();
        if (hmlVar == null) {
            hmlVar = new hml();
        }
        hmlVar.b = j;
        hmlVar.c = z;
        q(108, i, 0, hmlVar);
    }
}
