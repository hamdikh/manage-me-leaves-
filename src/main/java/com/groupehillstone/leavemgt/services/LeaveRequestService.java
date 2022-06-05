package com.groupehillstone.leavemgt.services;

import com.groupehillstone.leavemgt.dto.ResponseDTO;
import com.groupehillstone.leavemgt.entities.LeaveRequest;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LeaveRequestService {

    Page<LeaveRequest> findAll(Predicate predicate, Pageable pageable);

    Page<LeaveRequest> findAll(Pageable pageable);

    List<LeaveRequest> findAll();

    LeaveRequest findById(UUID id);

    Page<LeaveRequest> findLeaveRequestByCollaboratorId(UUID id, Pageable pageable);

    LeaveRequest create(LeaveRequest leaveRequest);

    LeaveRequest update(LeaveRequest leaveRequest);

    LeaveRequest response(UUID id, ResponseDTO responseDTO);

    void delete(UUID id);

    List<LeaveRequest> searchWithCriteria(String status, String type, LocalDate startDate, LocalDate endDate);

    List<LeaveRequest> searchWithCriteriaForCollaborator(UUID collaboratorId, String status, String type, LocalDate startDate, LocalDate endDate);

}
