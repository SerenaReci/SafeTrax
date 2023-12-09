package repository;

public class CompanyRepository {
    private  CompanyRepository companyRepository;
    private Long id;
    private String title;
    private String phone;

    public CompanyRepository(Long id,String title,String phone){
        this.id=id;
        this.title=title;
        this.phone=phone;

    }
}
