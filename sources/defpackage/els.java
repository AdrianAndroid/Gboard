package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: els */
/* loaded from: classes.dex */
public final class els extends gzm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/sharing/GboardSharingUtil");
    public emj b;
    private final iqe g = iqe.e(emb.c, 3);

    public els(Context context) {
        super(context, 26830000);
    }

    public static /* synthetic */ void f(mko mkoVar, mka mkaVar) {
        try {
            gyc.b.execute(new elr(mkaVar, (String) mkoVar.get(5000L, TimeUnit.MILLISECONDS), 0));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            gyc.b.execute(new elr(mkaVar, e, 2));
        }
    }

    public static void g(RecyclerView recyclerView, ely elyVar) {
        recyclerView.getContext();
        recyclerView.ab(new LinearLayoutManager());
        recyclerView.aa(elyVar);
    }

    private final void t(Intent intent) {
        Intent createChooser = Intent.createChooser(intent, this.c.getText(R.string.f166150_resource_name_obfuscated_res_0x7f1408bb));
        createChooser.addFlags(268435456);
        this.c.startActivity(createChooser);
    }

    public final Runnable a(final ely elyVar, final String str, final EditorInfo editorInfo) {
        return new Runnable() { // from class: elq
            /* JADX WARN: Not initialized variable reg: 21, insn: 0x01c6: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:139:0x01c5 */
            /* JADX WARN: Not initialized variable reg: 21, insn: 0x01cc: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:137:0x01cb */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0319 A[Catch: NullPointerException -> 0x034d, IllegalStateException -> 0x0363, TryCatch #15 {IllegalStateException -> 0x0363, NullPointerException -> 0x034d, blocks: (B:63:0x02f0, B:65:0x0319, B:71:0x0345, B:72:0x034c), top: B:62:0x02f0 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0345 A[Catch: NullPointerException -> 0x034d, IllegalStateException -> 0x0363, TryCatch #15 {IllegalStateException -> 0x0363, NullPointerException -> 0x034d, blocks: (B:63:0x02f0, B:65:0x0319, B:71:0x0345, B:72:0x034c), top: B:62:0x02f0 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 920
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.elq.run():void");
            }
        };
    }

    public final String c(List list, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        Resources resources = this.c.getResources();
        int size = list.size();
        if (size == 0) {
            return resources.getString(i);
        }
        sb.append(((hqt) list.get(0)).o(0));
        if (size == 1) {
            return resources.getString(i2, sb.toString());
        }
        int i4 = 1;
        while (true) {
            int i5 = size - 1;
            if (i4 < i5) {
                sb.append(", ");
                sb.append(((hqt) list.get(i4)).o(0));
                i4++;
            } else {
                return resources.getString(i3, sb.toString(), ((hqt) list.get(i5)).o(0));
            }
        }
    }

    public final void d(ely elyVar, mdu mduVar) {
        lmz x = elyVar.x();
        if (!x.isEmpty()) {
            b(x, 4);
            ieh.j().e(emm.SHARING_LINK_RECEIVING_USAGE, mduVar, mdt.LANGUAGE_ENABLED);
        }
    }

    public final void e(gzl gzlVar) {
        if (!ddc.f(this.c)) {
            return;
        }
        String a2 = ddc.a(this.c);
        kcu.U(l(a2), new cvt(this, gzlVar, a2, 5), gyc.b);
    }

    public final void h(View view, IBinder iBinder, String str) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        i(iBinder, str, rect.height(), null);
    }

    public final void i(IBinder iBinder, String str, int i, EditorInfo editorInfo) {
        if (!jam.t(this.c)) {
            ker.p(this.c, R.string.f153040_resource_name_obfuscated_res_0x7f1402bb, new Object[0]);
            return;
        }
        ely elyVar = new ely(llp.o(hqr.b()));
        this.b = new emj(this.c, iBinder, a(elyVar, str, editorInfo), elyVar, s(str), i);
        ieh.j().e(emm.SHARING_USAGE, s(str), mdy.ENTRYPOINT_CLICKED);
        this.b.show();
    }

    public final void j(EditorInfo editorInfo, Set set, String str) {
        String c = c(llp.o(set), R.string.f166160_resource_name_obfuscated_res_0x7f1408bc, R.string.f166200_resource_name_obfuscated_res_0x7f1408c0, R.string.f166210_resource_name_obfuscated_res_0x7f1408c1);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", c + " " + str);
        intent.putExtra("android.intent.extra.SUBJECT", this.c.getText(R.string.f153060_resource_name_obfuscated_res_0x7f1402bd));
        String m = editorInfo != null ? ham.m(editorInfo) : "";
        if (TextUtils.isEmpty(m) || !this.g.j(m)) {
            t(intent);
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.setPackage(m);
        intent2.addFlags(268435456);
        if (intent2.resolveActivity(this.c.getPackageManager()) != null) {
            this.c.startActivity(intent2);
        } else {
            t(intent);
        }
    }

    private static mdx s(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1942629643) {
            if (str.equals("access_point")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1043048979) {
            if (hashCode == -53226664 && str.equals("suggestion_bar")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("setting_sharing")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return mdx.SUGGESTION_BAR;
            }
            if (c == 2) {
                return mdx.ACCESS_POINT;
            }
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/GboardSharingUtil", "getSharingEvent", 122, "GboardSharingUtil.java")).w("Unknown utm source %s.", str);
            return mdx.ENTRYPOINT_UNKNOWN;
        }
        return mdx.SETTINGS;
    }
}
