package defpackage;

import android.app.backup.BackupDataOutput;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.libraries.inputmethod.backup.BackupAgent;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ein  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ein implements lfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ein(BackupDataOutput backupDataOutput, int i) {
        this.b = i;
        this.a = backupDataOutput;
    }

    public /* synthetic */ ein(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public /* synthetic */ ein(dba dbaVar, int i) {
        this.b = i;
        this.a = dbaVar;
    }

    public /* synthetic */ ein(gti gtiVar, int i) {
        this.b = i;
        this.a = gtiVar;
    }

    public /* synthetic */ ein(hqt hqtVar, int i) {
        this.b = i;
        this.a = hqtVar;
    }

    public /* synthetic */ ein(hsc hscVar, int i) {
        this.b = i;
        this.a = hscVar;
    }

    public /* synthetic */ ein(iqg iqgVar, int i) {
        this.b = i;
        this.a = iqgVar;
    }

    public /* synthetic */ ein(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public /* synthetic */ ein(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ ein(lmz lmzVar, int i) {
        this.b = i;
        this.a = lmzVar;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        joa joaVar;
        jnz jnzVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                return !((lmz) this.a).contains((cxc) obj);
            case 1:
                Object obj2 = this.a;
                ltg ltgVar = eij.a;
                return ((cxc) obj).b.equals(((dba) obj2).b);
            case 2:
                Object obj3 = this.a;
                hhl hhlVar = ejq.a;
                return !((lmz) obj3).contains(((cqp) obj).d());
            case 3:
                Object obj4 = this.a;
                joe joeVar = (joe) obj;
                Pattern pattern = gbx.a;
                if (joeVar.a == 13) {
                    joaVar = (joa) joeVar.b;
                } else {
                    joaVar = joa.f;
                }
                return joaVar.c.equals(obj4);
            case 4:
                Object obj5 = this.a;
                Pattern pattern2 = gbx.a;
                return ((joe) obj).d.equals(obj5);
            case 5:
                Object obj6 = this.a;
                joe joeVar2 = (joe) obj;
                Pattern pattern3 = gbx.a;
                if (joeVar2.a == 4) {
                    jnzVar = (jnz) joeVar2.b;
                } else {
                    jnzVar = jnz.d;
                }
                return jnzVar.a.equals(obj6);
            case 6:
                return ((llg) this.a).contains((String) obj);
            case 7:
                return ((View) obj) != this.a;
            case 8:
                return ((View) obj) != ((gti) this.a).a;
            case 9:
                return ((View) obj) != ((gti) this.a).a;
            case 10:
                return ((guh) ((ijj) obj)).g((String) this.a);
            case 11:
                Object obj7 = this.a;
                gvj gvjVar = (gvj) obj;
                lmz lmzVar = BackupAgent.a;
                int transportFlags = ((BackupDataOutput) obj7).getTransportFlags();
                int i = transportFlags & 1;
                boolean z2 = (transportFlags & 2) != 0;
                if (1 == i) {
                    z = true;
                }
                return gvjVar.f(z, z2);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return !hrx.ac((hqt) obj, (hsc) this.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj8 = this.a;
                ltg ltgVar2 = hrx.a;
                return !((lmz) obj8).contains((jav) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ltg ltgVar3 = hrx.a;
                return !this.a.equals((hqt) obj);
            case 15:
                return ((String) this.a).equals(((Preference) obj).t);
            case 16:
                return ((Preference) obj) == this.a;
            case 17:
                return ((lfe) obj).a(this.a);
            case 18:
                return ((String) obj).startsWith((String) this.a);
            case 19:
                return ((String) obj).equals(this.a);
            default:
                return ((iqg) this.a).j(obj);
        }
    }
}
