package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eck  reason: default package */
/* loaded from: classes.dex */
public final class eck implements AutoCloseable, hdm, hhk {
    static final llp a;
    public static final hhl b;
    static final hhl c = hhq.h("fast_access_bar_package_name_emojis_map", "{}");
    public static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/search/fastaccessbar/EmojiContentHelper");
    private final hhk enableVariantFlagObserver;
    public final hbd f;
    public llp i;
    public final cpu g = cqh.a().b;
    public final Map h = new qo();
    public final Map j = new qo();
    public boolean k = true;
    public hdl l = hdn.instance.h;
    public final hdz m = hdz.a();
    public final idk e = ieh.j();

    static {
        llp D = llp.D();
        a = D;
        b = hhq.h("fast_access_bar_default_emojis", TextUtils.join(",", D));
    }

    public eck(Context context) {
        bvl bvlVar = new bvl(this, 15);
        this.enableVariantFlagObserver = bvlVar;
        this.f = hbd.h(context);
        b.e(this);
        c.e(this);
        ecq.j.e(bvlVar);
        hdn.instance.i(this);
    }

    @Override // defpackage.hdm
    public final void b(hdl hdlVar) {
        this.l = hdlVar;
        e();
    }

    @Override // defpackage.hdm
    public final void c() {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.g(this);
        c.g(this);
        ecq.j.g(this.enableVariantFlagObserver);
        hdn.instance.j(this);
    }

    public final llp d(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.isEmpty()) {
                String b2 = this.f.g().b(str);
                if (!arrayList.contains(b2)) {
                    if (this.h.containsKey(b2)) {
                        arrayList.add(b2);
                    } else {
                        if (true != ((Boolean) ecq.j.c()).booleanValue()) {
                            str = b2;
                        }
                        if (!this.m.g(str, this.l)) {
                            llp a2 = this.f.g().a(str);
                            int size = a2.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    str = null;
                                    break;
                                }
                                String str2 = (String) a2.get(i);
                                i++;
                                if (this.m.g(str2, this.l)) {
                                    str = str2;
                                    break;
                                }
                            }
                        }
                        if (str != null) {
                            arrayList.add(b2);
                            this.h.put(b2, str);
                        }
                    }
                }
            }
        }
        return llp.o(arrayList);
    }

    public final void e() {
        this.i = null;
        this.j.clear();
        this.h.clear();
        this.k = true;
    }

    @Override // defpackage.hdm
    public final void hy() {
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        hhlVar.c();
        e();
    }
}
