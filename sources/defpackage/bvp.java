package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bvp */
/* loaded from: classes.dex */
public final class bvp implements ClipboardManager.OnPrimaryClipChangedListener {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler");
    public static final String[] b = {"_id"};
    public Context c;
    public ClipboardManager d;
    public hhk e;
    public hhk f;
    public volatile boolean g;
    public volatile mko i;
    public inm j;
    public bui k;
    public bur l;
    public hqt m;
    public EditorInfo n;
    public String o;
    public boolean p;
    public ino q;
    public bwi r;
    private inm t;
    private ijs u;
    private ContentObserver v;
    private final Handler s = new Handler(Looper.getMainLooper());
    public final AtomicInteger h = new AtomicInteger(Integer.MAX_VALUE);

    public static long a(Context context) {
        return ino.K(context, null).c("clipboard_primary_timestamp", 0L);
    }

    public static /* bridge */ /* synthetic */ void s(bvp bvpVar) {
        bvpVar.i = null;
    }

    private final mkr t() {
        int i = 1;
        if (true != this.g) {
            i = 9;
        }
        return gxo.a(i);
    }

    private final void u(String str) {
        ino.K(this.c, null).j("clipboard_primary_uri", str);
    }

    private final boolean v() {
        return this.q.x(R.string.f160550_resource_name_obfuscated_res_0x7f140654, false);
    }

    public final Cursor b(Uri uri, int i) {
        return this.c.getContentResolver().query(uri, new String[]{"_id", "timestamp", "uri"}, "item_type = ?", new String[]{Integer.toString(i)}, "timestamp DESC");
    }

    public final buk c(boolean z) {
        ClipboardManager clipboardManager = this.d;
        if (clipboardManager != null) {
            Context context = this.c;
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            ClipDescription primaryClipDescription = this.d.getPrimaryClipDescription();
            if (primaryClip == null || primaryClipDescription == null) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt.getText();
            String htmlText = itemAt.getHtmlText();
            Uri uri = itemAt.getUri();
            long currentTimeMillis = System.currentTimeMillis();
            if (Build.VERSION.SDK_INT >= 26) {
                long timestamp = primaryClipDescription.getTimestamp();
                if (timestamp > 0) {
                    currentTimeMillis = timestamp;
                }
            }
            buj g = buk.g();
            g.a = currentTimeMillis;
            g.e(text == null ? null : text.toString());
            g.c(htmlText);
            g.d(0);
            g.b = currentTimeMillis;
            if (!TextUtils.isEmpty(text)) {
                return g.a();
            }
            if (uri == null || !uri.toString().startsWith("content://") || bvu.k(context, uri) || primaryClipDescription.getMimeTypeCount() == 0 || !primaryClipDescription.getMimeType(0).startsWith("image")) {
                return null;
            }
            String e = jbc.e(uri);
            if (!e.isEmpty() && !e.startsWith("image")) {
                return null;
            }
            if (z) {
                Uri b2 = bvu.b(context, uri, currentTimeMillis);
                if (b2 == null) {
                    return null;
                }
                g.f(b2);
                return g.a();
            }
            String d = ino.K(context, null).d("clipboard_primary_uri", "");
            if (TextUtils.isEmpty(d)) {
                return null;
            }
            g.f(Uri.parse(d));
            return g.a();
        }
        return null;
    }

    public final mko d(buk bukVar, mkr mkrVar) {
        bur burVar = this.l;
        if (burVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String i = bukVar.i();
        llw llwVar = burVar.b;
        if (llwVar == null) {
            return null;
        }
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(((hfa) entry.getKey()).b(burVar.a, i, (String[]) entry.getValue(), mkrVar));
        }
        return mio.g(kcu.G(arrayList), new cjq(bukVar, i, 1), mkrVar);
    }

    public final void e() {
        bui buiVar = this.k;
        if (buiVar == null || buiVar.g == null) {
            return;
        }
        buiVar.a(10);
    }

    public final void f(buk bukVar) {
        g(llp.r(bukVar));
        if (!v()) {
            String j = bukVar.j();
            if (TextUtils.isEmpty(j)) {
                return;
            }
            u(j);
        }
    }

    public final void g(llp llpVar) {
        bui buiVar = this.k;
        if (buiVar != null) {
            boolean z = llpVar != null && !llpVar.isEmpty();
            if (!z || ((buk) llpVar.get(0)).e > ino.L().o(R.string.f160530_resource_name_obfuscated_res_0x7f140652, 0L)) {
                if (buiVar.g != null) {
                    buiVar.b.e(bwa.CHIP_EVENT, 8);
                }
                buiVar.g = true != z ? null : llpVar;
                buiVar.j = false;
                buiVar.e();
            }
        }
        if (v()) {
            llk e = llp.e();
            HashSet hashSet = new HashSet();
            int size = llpVar.size();
            for (int i = 0; i < size; i++) {
                buk bukVar = (buk) llpVar.get(i);
                if (hashSet.add(bukVar.i())) {
                    e.h(bukVar);
                }
            }
            llp g = e.g();
            mko hQ = t().hQ(new brs(this, g, 2));
            kcu.U(hQ, new bvo(this, g, 0), t());
            kcu.U(hQ, new bvo(this, g, 2), gyc.a);
        }
    }

    public final void h() {
        buk c = c(true);
        if (c != null) {
            ieh.j().e(bwa.COPY_ACTION, new Object[0]);
            long j = c.e;
            if (j == a(this.c)) {
                return;
            }
            j(j);
            if (!TextUtils.isEmpty(c.i())) {
                mko d = d(c, t());
                if (d != null) {
                    kcu.U(d, new bvo(this, c, 1), gyc.b);
                    return;
                } else {
                    f(c);
                    return;
                }
            }
            f(c);
            return;
        }
        j(0L);
        e();
    }

    public final void i(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("uri"));
        if (!TextUtils.isEmpty(string)) {
            bvu.i(this.c, cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), string);
        }
    }

    final void j(long j) {
        ino.K(this.c, null).i("clipboard_primary_timestamp", j);
    }

    public final void k() {
        inm inmVar = this.t;
        if (inmVar != null) {
            this.q.ae(inmVar, R.string.f160800_resource_name_obfuscated_res_0x7f140670);
            this.t = null;
        }
    }

    public final void l() {
        if (this.u != null) {
            ijt e = ijt.e(this.c);
            String p = e.c.p(R.string.f160980_resource_name_obfuscated_res_0x7f140682);
            if (e.d.remove(p) == null) {
                ((ltd) ijt.a.a(hip.a).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "removeFeature", 375, "FeaturePermissionsManager.java")).w("Cannot remove unregistered feature [%s]", p);
            }
            this.u = null;
        }
    }

    public final void m() {
        if (this.v != null) {
            this.c.getContentResolver().unregisterContentObserver(this.v);
            this.v = null;
        }
    }

    public final void n() {
        if (!this.q.aj(R.string.f160650_resource_name_obfuscated_res_0x7f140661)) {
            this.k = null;
            return;
        }
        bui buiVar = new bui(ieh.j());
        this.k = buiVar;
        hqt hqtVar = this.m;
        if (hqtVar == null) {
            return;
        }
        buiVar.g(hqtVar, this.n, this.p);
    }

    public final void o() {
        if (!this.q.aj(R.string.f160800_resource_name_obfuscated_res_0x7f140670)) {
            this.l = null;
            return;
        }
        bur burVar = new bur(this.c);
        this.l = burVar;
        burVar.b();
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        if (!v()) {
            String d = ino.K(this.c, null).d("clipboard_primary_uri", "");
            if (!TextUtils.isEmpty(d)) {
                gxo.a(9).hP(new bwt(this, d, 1));
                u("");
            }
        }
        if (hsu.f()) {
            return;
        }
        h();
    }

    public final void p(hhl hhlVar) {
        if (((Boolean) hhlVar.c()).booleanValue()) {
            btf btfVar = new btf(this, 4);
            this.t = btfVar;
            this.q.X(btfVar, R.string.f160800_resource_name_obfuscated_res_0x7f140670);
            o();
            return;
        }
        k();
        this.l = null;
    }

    public final void q(hhl hhlVar) {
        if (((Boolean) hhlVar.c()).booleanValue()) {
            ijt e = ijt.e(this.c);
            e.k(R.string.f160980_resource_name_obfuscated_res_0x7f140682, R.string.f164120_resource_name_obfuscated_res_0x7f1407dc, ijw.a());
            bvm bvmVar = new bvm(this);
            this.u = bvmVar;
            e.l(R.string.f160980_resource_name_obfuscated_res_0x7f140682, bvmVar);
            r(e.n(R.string.f160980_resource_name_obfuscated_res_0x7f140682));
            return;
        }
        l();
        m();
    }

    public final void r(boolean z) {
        if (z) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler", "updateScreenshotsContentObserver", 258, "ClipboardDataHandler.java")).t("Enable the feature of handling screenshots in the clipboard.");
            ino.K(this.c, null).f("clipboard_screenshot_enabled_at_least_once", true);
            if (this.v == null) {
                this.v = new bvn(this, this.s);
                this.c.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.v);
            }
            ieh.j().e(bwa.SCREENSHOT_EVENT, 4);
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler", "updateScreenshotsContentObserver", 269, "ClipboardDataHandler.java")).t("Disable the feature of handling screenshots in the clipboard.");
        m();
        ieh.j().e(bwa.SCREENSHOT_EVENT, 5);
    }
}
