package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: uh  reason: default package */
/* loaded from: classes2.dex */
public final class uh {
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    public int h;
    boolean i;
    ui j;
    int k;
    int l;
    boolean m;
    public boolean n;
    Bundle o;
    public String p;
    boolean q;
    public Notification r;
    @Deprecated
    public ArrayList s;

    @Deprecated
    public uh(Context context) {
        this(context, null);
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.CharSequence, long[], android.net.Uri, java.lang.String] */
    public final Notification a() {
        Notification.Builder builder;
        ArrayList<String> arrayList;
        ?? r4;
        Notification build;
        Bundle bundle;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(this.a, this.p);
        } else {
            builder = new Notification.Builder(this.a);
        }
        Notification notification = this.r;
        Context context = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(this.k, this.l, this.m);
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.h);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            uf ufVar = (uf) arrayList2.get(i);
            IconCompat a = ufVar.a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a != null ? wh.b(a, context) : context, ufVar.e, ufVar.f);
            Bundle bundle3 = new Bundle(ufVar.a);
            boolean z = ufVar.b;
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            if (Build.VERSION.SDK_INT >= 24) {
                boolean z2 = ufVar.b;
                builder2.setAllowGeneratedReplies(true);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                builder2.setSemanticAction(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder2.setContextual(false);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                builder2.setAuthenticationRequired(false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", ufVar.c);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
            i++;
            context = null;
        }
        Bundle bundle4 = this.o;
        if (bundle4 != null) {
            bundle2.putAll(bundle4);
        }
        builder.setShowWhen(this.i);
        builder.setLocalOnly(this.n).setGroup(null).setGroupSummary(false).setSortKey(null);
        builder.setCategory(null).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList3 = this.c;
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    jf jfVar = (jf) it.next();
                    throw null;
                }
            }
            ArrayList arrayList4 = this.s;
            if (arrayList == null) {
                arrayList = arrayList4;
            } else if (arrayList4 != null) {
                qq qqVar = new qq(arrayList.size() + arrayList4.size());
                qqVar.addAll(arrayList);
                qqVar.addAll(arrayList4);
                arrayList = new ArrayList(qqVar);
            }
        } else {
            arrayList = this.s;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str : arrayList) {
                builder.addPerson(str);
            }
        }
        if (this.d.size() > 0) {
            Bundle bundle5 = b().getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                String num = Integer.toString(i2);
                uf ufVar2 = (uf) this.d.get(i2);
                Bundle bundle8 = new Bundle();
                IconCompat a2 = ufVar2.a();
                bundle8.putInt("icon", a2 != null ? a2.a() : 0);
                bundle8.putCharSequence("title", ufVar2.e);
                bundle8.putParcelable("actionIntent", ufVar2.f);
                Bundle bundle9 = new Bundle(ufVar2.a);
                boolean z3 = ufVar2.b;
                bundle9.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle9);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", ufVar2.c);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            b().putBundle("android.car.EXTENSIONS", bundle5);
            bundle2.putBundle("android.car.EXTENSIONS", bundle6);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            r4 = 0;
            builder.setExtras(this.o).setRemoteInputHistory(null);
        } else {
            r4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setBadgeIconType(0).setSettingsText(r4).setShortcutId(r4).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(this.p)) {
                builder.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList5 = this.c;
            if (arrayList5.size() > 0) {
                jf jfVar2 = (jf) arrayList5.get(0);
                throw null;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setAllowSystemGeneratedContextualActions(this.q);
            builder.setBubbleMetadata(null);
        }
        ui uiVar = this.j;
        if (uiVar != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(((ug) uiVar).a);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = builder.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            build = builder.build();
        } else {
            builder.setExtras(bundle2);
            build = builder.build();
        }
        if (uiVar != null && (bundle = build.extras) != null) {
            bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return build;
    }

    public final Bundle b() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final void d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new uf(i, charSequence, pendingIntent));
    }

    public final void e(boolean z) {
        if (z) {
            this.r.flags |= 16;
            return;
        }
        this.r.flags &= -17;
    }

    public final void f(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void h(int i, int i2, boolean z) {
        this.k = i;
        this.l = i2;
        this.m = z;
    }

    public final void i(int i) {
        this.r.icon = i;
    }

    public final void j(ui uiVar) {
        if (this.j != uiVar) {
            this.j = uiVar;
            if (uiVar == null || uiVar.b == this) {
                return;
            }
            uiVar.b = this;
            uh uhVar = uiVar.b;
            if (uhVar == null) {
                return;
            }
            uhVar.j(uiVar);
        }
    }

    public uh(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.i = true;
        this.n = false;
        Notification notification = new Notification();
        this.r = notification;
        this.a = context;
        this.p = str;
        notification.when = System.currentTimeMillis();
        this.r.audioStreamType = -1;
        this.h = 0;
        this.s = new ArrayList();
        this.q = true;
    }
}
